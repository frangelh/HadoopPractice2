#!/usr/bin/groovy
BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
br.readLines().each{ line ->
    def linscmp = line.split('\t')
    // categoria + monto
    println "${linscmp[3]}\t${linscmp[4]}"
}