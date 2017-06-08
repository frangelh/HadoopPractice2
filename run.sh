#!/usr/bin/sh
rm -rf output
hadoopStream=/usr/lib/hadoop/share/hadoop/tools/lib/hadoop-streaming-2.8.0.jar
mapper=groovy/map/mapTiendaMonto.groovy
reducer=groovy/reducer/reduceTiendaMonto.groovy
inputFile=./input
outputFile=./output
hadoop jar $hadoopStream -input $inputFile -output $outputFile -mapper "$mapper" -reducer "$reducer"
# echo "hadoop jar $hadoopStream -input ./t -output $outputFile -mapper "$mapper" -reducer "$reducer""