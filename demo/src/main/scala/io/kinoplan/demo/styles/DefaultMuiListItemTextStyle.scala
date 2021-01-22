package io.kinoplan.demo.styles

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class MuiListItemText(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import dsl._

  val inset = style(
    paddingLeft(0.px)
  )

}

object DefaultMuiListItemTextStyle extends MuiListItemText


