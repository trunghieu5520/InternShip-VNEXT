#!/bin/bash
# Author: @theurbanpenguin
# Web: www.theurbapenguin.com
# Sample menu
# Last Edited" May 2021

while true
do 
  clear
  echo "Choose an item: a,b or c"
  echo "a: Backup"
  echo "b: Login and infor"
  echo "c: Buy Fruit"
  echo "d: Exit"
  read -sn1
  case "$REPLY" in
	a) tar -czvf $HOME/backup.tgz ${HOME}/bin;;
	b) /bin/bash info.sh;;
	c) /bin/bash grade.sh;;
	d) exit 0;;
  esac
  read -n1 -p "Press any key to continue"
done