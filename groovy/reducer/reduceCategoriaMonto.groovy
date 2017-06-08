#!/usr/bin/groovy
BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
String currentWord = "";
String maxCategoria = "";
long maxAmountCategoria = 0;
println "Categoria mas vendida"
br.readLines().each{ line->
    def comp = line.split('\t')
    String key = comp[0]
    double currentAmount = comp[1] as double
    if(key == currentWord){
        amount += currentAmount;
    } else {
        currentWord = key
        amount = currentAmount
    }
    if(amount > maxAmountCategoria){
        maxCategoria = currentWord
        maxAmountCategoria = amount;
    }
}
println "$maxCategoria\t$maxAmountCategoria"