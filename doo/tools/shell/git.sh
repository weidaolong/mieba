#!/bin/sh
array_url[0]='xxx'

for var in ${array_url[@]};
do
    git clone $var

done
