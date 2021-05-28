#!/bin/bash
#Welcome script to display a message to users
#Author: @theurbanpenguin
#Date: 1/1/1971
RED="\033[31m"
GREEN="\033[32m"
BLUE="\033[34m"
RESET="\033[0m"
if [ $# -lt 1 ] ; then
echo -e "${RED}Usage: $0 <name>$RESET"
exit 1
fi
echo -e "${GREEN}Hello $1$RESET"
exit 0