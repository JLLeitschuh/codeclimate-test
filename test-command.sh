#!/usr/bin/env bash
~/pmd-bin-6.7.0/bin/run.sh pmd -R https://raw.githubusercontent.com/JLLeitschuh/codeclimate-test/master/my-custom.xml -f codeclimate  -d /src
