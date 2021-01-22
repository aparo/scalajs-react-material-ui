object DependenciesNPM {

  object Versions {
    val reactV = "16.13.1"
    val reactSwipeableViewsV = "0.13.9"
  }

  import Versions._

  //A -> Z
  val materialUiCore                = "@material-ui/core"                  -> "4.11.0"
  val materialUiIcons               = "@material-ui/icons"                 -> "4.9.1"
  val materialUiLab                 = "@material-ui/lab"                   -> "4.0.0-alpha.56"
  val react                         = "react"                              -> reactV
  val reactDom                      = "react-dom"                          -> reactV
  val reactSwipeableViews           = "react-swipeable-views"              -> reactSwipeableViewsV
  val reactSwipeableViewsUtils      = "react-swipeable-views-utils"        -> reactSwipeableViewsV
  val typesReact                    = "@types/react"                       -> "16.9.42"
  val typesReactDom                 = "@types/react-dom"                   -> "16.9.8"
  val typesReactSwipeableViews      = "@types/react-swipeable-views"       -> "0.13.0"
  val typesReactSwipeableViewsUtils = "@types/react-swipeable-views-utils" -> "0.13.2"
}
