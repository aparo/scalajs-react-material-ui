package io.kinoplan.demo.styles.labs.Skeleton

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}

case class SkeletonStyle(common: CommonStyle = DefaultCommonStyle) extends StyleSheet.Inline {
  import dsl._

  val root = style(
    height(180.px)
  )

}

object DefaultSkeletonStyle extends SkeletonStyle
