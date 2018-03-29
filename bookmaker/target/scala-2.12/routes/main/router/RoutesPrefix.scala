// @GENERATOR:play-routes-compiler
// @SOURCE:C:/play/bookmaker/conf/routes
// @DATE:Thu Mar 29 16:16:57 JST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
