#!/usr/bin/sh
rm -rf output
hadoopStream=/usr/lib/hadoop/share/hadoop/tools/lib/hadoop-streaming-2.8.0.jar
mapper=groovy/map/mapCategoriaMonto.groovy
reducer=groovy/reducer/reduceCategoriaMonto.groovy
inputFile=./purchases.txt
outputFile=./output
hadoop jar $hadoopStream -input $inputFile -output $outputFile -mapper "$mapper" -reducer "$reducer"
# echo "hadoop jar $hadoopStream -input ./t -output $outputFile -mapper "$mapper" -reducer "$reducer""