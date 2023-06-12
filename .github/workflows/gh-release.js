name: Github Release

on:
  workflow_dispatch:
  push:
    branches:
      - main

jobs:
  gh_release:
    permissions:
      contents: write
    runs-on: ubuntu-latest
    steps:
      - uses: actions/checkout@v3
        with:
          fetch-depth: 0
          token: ${{ secrets.ADYEN_AUTOMATION_BOT_ACCESS_TOKEN }}
      - name: Grab version
        uses: actions/github-script@v6
        id: release
        with:
          script: |
            const helper = require('./.github/scripts/helper.js')
            core.setOutput('version', helper.pomJavaVersion())
      - name: Create new release
        env:
          GH_TOKEN: ${{ secrets.ADYEN_AUTOMATION_BOT_ACCESS_TOKEN }}
        run: |
          gh release create v${{steps.release.outputs.version}} \
            --title 'Adyen Java API Library v${{steps.release.outputs.version}}' \
            --generate-notes --target main
      - name: Update develop branch
        run: |
          git checkout develop
          git merge main
          git push origin develop