## dictionary with treeArray
Node class:
4 variables are assigned vocabulary keeps the word, means keep the meaning of words, and left and right variables care of next to words.

printNode:
If it has value left of the node first it is written then root is 
written then the right value of the node is written.

Myhash class:
İn constructor, the size of the table is specified İn hash method,
the sent word is converted to Unicode with letters by letter then 
sum each letter’s Unicode and it takes the mode to the prime number.

İn Add method;
The node (which is wanted) is sent to the hash function and equals
its index then it sent the node to add an index as a parameter.

İn add method;
The if the root node is null, a new node is added and return Add 
method. If 2 or more items have collusion it compares them 
with each other with compare method, if it is smaller(<) it 
returns -1 and throws it to the result if it is bigger(>) result returns 
0 or 1 then throw in the result.
If it is -1 it is going to be left root, if it is not it is going to be 
right root. 

İn readfilename method;
It reads words and meaning from txt file then it prints them 
when it sees: ( double dot) it prints vocabulary left side of : 
and it prints the meaning of the word right side. İf there is an 
error it throws an exception and prints on the screen.

İn printmean method;
By creating a search node for the searched word, the search node 
goes to the hash table and then it put the index which is come. 
Findmean starts to work then it will be written on the screen 
the returned value from the findMean method.

In findMean method;
If the root is null it returns “Aranan kelime yok”,
if it is not compared root with the searching item with compares method 
then the result from transfer to the result. The compares method 
compares the root variable and the snode (searched words) 
and then transfers to the result. If it is found the searched 
vocabulary, the result equals 0 and the function returns the 
meaning of the word.
If the root is bigger than the vocabulary function throws it left 
side of the root inside the function as recursive. The process 
continues until it finds searched vocabulary. If it is smaller 
than the root it will be the same process for the right of the 
root.

Main class:
To use functions that are in the myhash and node class, first 
first of all, we create an object.İt prints the meaning of 
our vocabulary which we enter the vocabulary if there is, if it is not it prints
“ aranan kelime yok” 
Table of creating with separate chaining
