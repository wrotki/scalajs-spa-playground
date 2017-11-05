import scala.scalajs.js
import scala.scalajs.js.annotation.{JSExport, JSImport}
import org.scalajs.dom
import japgolly.scalajs.react._
import japgolly.scalajs.react.component.Js
import japgolly.scalajs.react.component.Js.{MountedWithRawType, RawMounted}
import japgolly.scalajs.react.vdom.html_<^._
import spa.client.ace.Ace
import spa.client.elemental.buttons.Button
import spa.client.elemental.grid.{Col, Row}
import spa.client.logger._

@JSExport("SPAMain")
object SPAMain extends js.JSApp {

  @JSExport
  def main(): Unit = {
    log.warn("Application starting")

    val ace = Ace.component(Ace.props(
      mode = "scala",
      theme = "gob",
      name = "ace", // Unique id of <div>
      width = "100%",
      maxLines = 50,
      fontSize = 12,
      value = "function main(){ console.log(\"FooBar\"); }"
    ))()

    val button = Button.component(Button.props(size = "lg"))( <.div("Large button"))
    val col = Col.component(Col.props(sm = "1/3"))(button)
    val row = Row.component(Row.props(size = "0"))(col,col,col)

    val component = <.div(
      <.div("BEFORE"),
      ace,
      <.div("AFTER"),
      row
//      ,
//      css
    )

    component.renderIntoDOM(dom.document.getElementById("ace"))
  }
}

