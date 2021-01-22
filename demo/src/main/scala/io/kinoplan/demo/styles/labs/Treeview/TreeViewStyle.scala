package io.kinoplan.demo.styles.labs.Treeview

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class TreeViewStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import dsl._

  val toggleContainer = style(
    height(216.px),
    flexGrow(1),
    maxWidth(400.px)
  )
}

object DefaultTreeViewStyle extends TreeViewStyle
