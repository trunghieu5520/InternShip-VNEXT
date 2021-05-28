#!/bin/bash
if awk 'BEGIN{if('$RSS'>='1000')exit 0;exit 1}'
then
RED="\033[31m"
echo -e "${RED} $Process exceeds 1000M on $PID \033[0m" >>output.txt
else
GREEN="\033[32m"
echo -e "${GREEN} Memory Utilization is normal for $Process on $PID \033[0m" >>output.txt
fi