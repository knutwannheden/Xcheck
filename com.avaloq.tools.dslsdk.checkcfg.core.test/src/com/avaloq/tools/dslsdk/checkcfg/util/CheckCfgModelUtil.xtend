package com.avaloq.tools.dslsdk.checkcfg.util

/*
 * Provides utility operations for Check Configuration model stubs. Only partial models
 * are returned as strings.
 */
class CheckCfgModelUtil {

  def String basicModel() {'''
    check configuration "Testing" {'''.toString
  }

  def String basicModelWithCatalog() {
    basicModel + '''
      catalog Sample {'''.toString
  }

  def String basicModelWithTest() {
    basicModelWithCatalog + '''
      Test'''.toString
  }

  def String basicModelWithDisabledTest() {
    basicModelWithCatalog + '''
      ignore Test'''.toString
  }

}