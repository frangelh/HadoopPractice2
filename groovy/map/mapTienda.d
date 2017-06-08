#!/usr/bin/rdmd
import std.array;
import std.stdio;

void main() {
    foreach (string line; stdin.byLineCopy.array) {
        string[] cmp = line.split("\t");
        writeln(cmp[2] ~ "\t" ~ cmp[4]);
    }
}
