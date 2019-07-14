package io.kinoplan.scalajs.react.material.ui.core.styles

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait TypeBackground extends js.Object {
  def default: String = js.native
  def paper: String = js.native
  def light: String = js.native
}

object TypeBackground {
  def apply(
    default: String,
    paper: String,
    light: String
  ) = {
    val o: Map[String, Any] = Map(
      "default" -> default,
      "paper" -> paper,
      "light" -> light
    )

    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[TypeBackground]
  }
}
