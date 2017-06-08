#!/usr/bin/groovy
BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
br.readLines().each{ line ->
    String [] linscmp = line.trim().split('\t')
    println "${linscmp[2]}\t${linscmp[4]}"
}