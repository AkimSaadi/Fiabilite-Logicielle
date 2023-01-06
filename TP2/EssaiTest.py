__author__ = 'lugiez'
__Filename__ = 'EssaiTest'
__Creationdate__ = '26/09/17'

import unittest

from Essai import *

class EssaitTest(unittest.TestCase):

    def testGetVal(self):
        e = Essai(1.0)
        val = e.getVal()
        expected = 1.0
        self.assertEquals(expected, val)

    def testAjouterZero(self) :
        e =Essai(1.0)
        e.ajouter(0.0)
        expected = 1.0
        self.assertEquals(expected, e.getVal())

    def testDivisionParZero(self) :
        e = Essai(0.0)
        self.assertRaises(ZeroDivisionError, e.inverserVal, )

    #le meme sans assertion spéciale
    def testDivisionParZeroBis(self):
        e = Essai(0.0)
        try :
            f = e.inverserVal()
            self.assertTrue(False) #echouer si pas d'exception
        except Exception:
            self.assertTrue(True)


if __name__ == '__main__':  # ce qu'il faut ajouter pour que les
    unittest.main()  # tests soient effectu�s sous l'interpréteur
