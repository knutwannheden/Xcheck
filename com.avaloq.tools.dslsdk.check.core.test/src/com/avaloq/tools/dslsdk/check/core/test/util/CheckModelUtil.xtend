package com.avaloq.tools.dslsdk.check.core.test.util

import java.util.List

/*
 * Provides utility operations for Check model stubs. Only partial models
 * are returned as strings.
 */
class CheckModelUtil {

  /* Returns a base model stub with package (com.test), catalog (c) and grammar (g). */
  def String modelWithGrammar () {'''
    package com.test
    catalog c for grammar g {'''.toString
  }

  /* Returns a base model stub with a default category. */
  def String modelWithCategory () {
    modelWithGrammar+ '''
      category "Default Category" {'''.toString
  }

  /* Returns a base model stub with a check of given name. */
  def String modelWithCheck (String checkName, String parameter) {
    modelWithCategory + '''
      error "«checkName»" («parameter»)
      message "My Message" {'''.toString
  }

  /* Returns a base model stub with a severity range. */
  def String modelWithSeverityRange (String min, String max, String severity) {
    modelWithCategory + '''@SeverityRange(«min» .. «max»)
    «severity» "My Check" ()
    message "My Message"'''.toString
  }

  /* Returns a base model stub with a severity range and a default check. */
  def String modelWithSeverityRange (String min, String max) {
    modelWithCategory + '''@SeverityRange(«min» .. «max»)
    '''.toString + modelWithCheck
  }

  /* Returns a base model stub with a check of given name. */
  def String modelWithCheck (String checkName) {
    modelWithCategory + '''
      error "«checkName»" ()
      message "My Message" {'''.toString
  }

  /*
   * Returns a base model stub with a check (SomeError) with severity 'error'
   * and message (MyMessage).
   */
  def String modelWithCheck () {
    modelWithCategory + '''
      error "Some Error" ()
      message "My Message" {'''.toString
  }

  /* Returns a dummy check with given label. */
  def String emptyCheck(String label) { '''
    error "«label»" ()
    message "My message" {
    }'''.toString
  }

	/*
	 * Returns a base model stub with a context using context type ContextType
	 * 'ctx'.
	 */
  def String modelWithContext() {
	  modelWithCheck + '''
    for ContextType ctx {'''.toString
  }

	/* Returns a base model stub with a give collection of contexts. */
  def String modelWithContexts(List<String> contexts) {
	  modelWithCheck + '''
    «FOR c:contexts»
      «c.toString»
    «ENDFOR»'''.toString
  }

  /* Returns a complete Check model with multiple SL_ and ML_COMMENTS */
  def String modelWithComments() {'''
  package com.test // SL1
  /* ML1 */
  catalog c /* ML2 */ for grammar g {
    // SL2
    category "My cat" {
      /* ML3 */
      // SL3
      error MYerr "My Err" (int Abc = 23) message "A" {
        for Atype thisName {
          val x = 3 // SL4
          // SL5
          /* ML5 */ issue /* ML4 */
          // SL6
        }
      }
    } // SL7
  }'''.toString()

  }

}