#!/bin/sh
RED="\033[31m"
GREEN="\033[32m"
BLUE="\033[34m"
RESET="\033[0m"
echo "Enter Fruit name: "
read FRUIT
case "$FRUIT" in
   "apple") echo -e "${RED}Apple pie is quite tasty.$RESET" 
   ;;
   "banana") echo -e "${GREEN}I like banana nut bread.$RESET" 
   ;;
   "kiwi") echo -e "${BLUE}New Zealand is famous for kiwi.$RESET" 
   ;;
   *) echo "Sold out this fruit"
esac