"""
Zakari IKHOU 
Akim SAADI
Mohamed TAKHCHI
Reda CHANAA
Sohaib EL MOUHTADI 
12/01/2020
"""

#! /usr/bin/python3

from scriptRecherche import ListeTriee
import unittest

class testChercherElt(unittest.TestCase):

    def testEltIn(self):
        search1 = ListeTriee([1,2,3,4,5,6,7,8,9])
        elt = search1.chercherElt(4)
        expected = 3
        self.assertEqual(expected, elt)
        
    def testEltNotIn(self):
        search2 = ListeTriee([21,42,43,54,55,76,87,98])
        elt = search2.chercherElt(80)
        expected = -1
        self.assertEqual(expected, elt)
        
    def testEltMin(self):
        search3 = ListeTriee([1,2,3,4,4,4,5,6,7,8,9])
        elt = search3.chercherElt(4)
        expected = 3
        self.assertEqual(expected, elt)

if __name__ == '__main__':
    unittest.main()
