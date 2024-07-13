//Question on unordered map
//given a string of words, find frequencies of individual words.

#include<iostream>
#include<unordered_map>
#include<sstream>
using namespace std;

void printFrequency(string str)
{
	unordered_map<string, int> umap;
	stringstream ss(str);
	string word;
	while (ss>>word)
	{
		umap[word]++;
	}
	unordered_map<string, int>::iterator itr;
	for (itr=umap.begin();itr!=umap.end();itr++)
	{
		cout << itr->first << " " << itr->second << endl;
	}
}

int main()
{
	string str = "geeks for geeks for practicing questions";
	printFrequency(str);
}