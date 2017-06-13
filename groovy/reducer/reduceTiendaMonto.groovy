#!/usr/bin/groovy
BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
String currentWord = "";
double amount = 0;
println "Tienda\tTotal"
br.readLines().each{ line->
    def comp = line.split('\t')
    String key = comp[0]
    double currentAmount = comp[1] as double
    if(key == currentWord){
        amount += currentAmount;
    } else {
        if(!currentWord.isEmpty()){
            printf "%s\t%.02f\n",currentWord,amount
        }
        currentWord = key
        amount = currentAmount
    }
}
printf "%s\t%.02f\n",currentWord,amount