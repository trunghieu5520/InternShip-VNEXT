#!/bin/bash
# Welcome script to display a message to users on login
# Author: @hieunguyen5520
# Date: 05/05/2000
RED="\033[31m"
GREEN="\033[32m"
BLUE="\033[34m"
RESET="\033[0m"
echo "Type color or mono for script output: "
read color
#Where parameters are not set the display will be mono
if [ $color = RED ] || [ $color = red ] ; then
echo -e "${RED}This is $0 $RESET"
elif [ $color = GREEN ] || [ $color = green ] ; then
echo -e "${GREEN}This is $0 $RESET"
elif [ $color = BLUE ] || [ $color = blue ] ; then
echo -e "${BLUE}This is $0 $RESET"
else 
echo "Please enter RGB color"
echo -e "This is $0"
fi
exit 0