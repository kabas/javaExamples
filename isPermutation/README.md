problem: Given two strings, determine if one is a permuation of the other.

This answer chooses to sort both strings before checking, however if an assumption is made on the character set, then you could create an array of that size then flip the positions for each character in the array. Then traverse the second array making sure each character has a 1/true value in it.
