#!/bin/sh
echo "what is your name ?"
read name
echo "How do you do, $name?"
read remark 
echo "$remark too!"
echo "How's the weather today ?"
read weather
echo "$weather !!!"
echo "Ok , You can log in system"
echo "Enter username"
read user
if [ $user="hieunt" ]
then 
	echo "The user name is correct."
else
	echo "The user name is incorrect, try again."
fi
echo "Enter password"
read pass
if [ $pass="123" ]
then
	echo "The password is correct."
else
	echo "The password is incorrect, try again."
fi
echo "Login Success"


