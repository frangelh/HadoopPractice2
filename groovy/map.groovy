#!/usr/bin/groovy
BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
br.readLines().each{ line ->
    def linscmp = line.split('\t')
    //tienda + monto
    println "${linscmp[2]}\t${linscmp[4]}"
    // categoria + monto
    println "${linscmp[3]}\t${linscmp[4]}"
    //categoria + mono y visa
    if(linscmp[5].toLowerCase() == "visa") {
           println "${linscmp[3]}\t${linscmp[4]}"
    }
}