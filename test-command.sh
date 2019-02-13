#!/usr/bin/env bash
~/pmd-bin-6.7.0/bin/run.sh pmd -R https://raw.githubusercontent.com/JLLeitschuh/codeclimate-test/master/my-custom.xml -f codeclimate -auxclasspath https://raw.githubusercontent.com/JLLeitschuh/codeclimate-test/master/codeclimate-test.jar -d /Users/jonathanleitschuh/git_repos/codeclimate-test/src
