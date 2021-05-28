#!/bin/sh
echo "what is your name ?" 
read name
echo "What is your gender ?" 
read gender
if [ $gender = "Male" ] || [ $gender = "male" ] ; then
	echo "Hello Mr $name"
elif [ $gender = "Female" ] || [ $gender = "female" ] ; then
	echo "Hello Mrs $name"
else
	echo "Hello $name"
fi
