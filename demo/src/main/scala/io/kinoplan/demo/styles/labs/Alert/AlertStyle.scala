package io.kinoplan.demo.styles.labs.Alert

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class AlertStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import dsl._

  val root = style(
    height(380.px)
  )

}

object DefaultAlertStyle extends AlertStyle
