package io.kinoplan.demo.components.labs.TreeView

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.labs.Treeview.{DefaultTreeViewStyle, TreeViewStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiGrid, MuiTypography}
import io.kinoplan.scalajs.react.material.ui.icons.{MuiIcons, MuiIconsModule}
import io.kinoplan.scalajs.react.material.ui.lab.{MuiTreeItem, MuiTreeViewSingle}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import japgolly.scalajs.react.{BackendScope, Callback, ReactEvent, ScalaComponent}
import scalacss.ScalaCssReactImplicits

object TreeViews extends ScalaCssReactImplicits {
  case class Props(style: TreeViewStyle)

  case class State(
      selected:String=""
  )
  class Backend(t: BackendScope[Props, State]) {

    def selected(event:ReactEvent, value:String) : Callback={
      t.modState(_.copy(selected=value))
    }

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Treeviews")(
          MuiGrid(container = true, spacing = 16)(
            MuiGrid(item = true, xs = 12, sm = 6)(
              div(
                css.toggleContainer,
                MuiTreeViewSingle(
                  defaultCollapseIcon = MuiIcons(MuiIconsModule.ExpandMore)()(),
                  defaultExpandIcon = MuiIcons(MuiIconsModule.ChevronRight)()(),
                  onNodeSelect=selected _
                )(
                  MuiTreeItem(nodeId = "1", label = "Applications")(
                    MuiTreeItem(nodeId = "2", label = "Calendar")(),
                    MuiTreeItem(nodeId = "3", label = "Chrome")(),
                    MuiTreeItem(nodeId = "4", label = "Webstorm")()
                  ),
                  MuiTreeItem(nodeId = "5", label = "Documents")(
                    MuiTreeItem(nodeId = "10", label = "OSS")(),
                    MuiTreeItem(nodeId = "6", label = "Material-UI")(
                      MuiTreeItem(nodeId = "7", label = "src")(
                        MuiTreeItem(nodeId = "8", label = "index.js")(),
                        MuiTreeItem(nodeId = "9", label = "treeview.js")()
                      )
                    )
                  )
                )
              ),
              MuiTypography(
                variant = MuiTypography.Variant.caption,
                gutterBottom = true
              )("Selection:"+state.selected),
              MuiTypography(
                variant = MuiTypography.Variant.caption,
                gutterBottom = true
              )("Exclusive Selection"),
              MuiTypography(variant = MuiTypography.Variant.caption)(
                "Text justification toggle buttons present options for left, right, center, full, and\n " +
                  "justified text with only one item available for selection at a time. Selecting one\n " +
                  "option deselects any other."
              )
            ),
            MuiGrid(item = true, xs = 12, sm = 6)(
              div(css.toggleContainer),
              MuiTypography(
                variant = MuiTypography.Variant.caption,
                gutterBottom = true
              )("Multiple Selection"),
              MuiTypography(variant = MuiTypography.Variant.caption)(
                "Logically-grouped options, like Bold, Italic, and Underline, allow multiple options to\n " +
                  "be selected."
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent
    .builder[Props]("TreeViews")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: TreeViewStyle = DefaultTreeViewStyle) =
    component(Props(style))

}
