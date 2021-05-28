#!/bin/sh

echo "Enter Student name: "
read Name
echo "Enter Type Grade: "
read Grade
case "$Grade" in
  [A-C]|[a-c]) echo "$Name is a star pupil"
  ;;
  [Dd]) echo "$Name needs to try a little harder!"
  ;;
  [E-F]|[e-f]) echo "$Name could do a lot better next year"
  ;;
  *) echo "Please enter grade from A-F"
esac
