package org.scalafx.abacussfx

import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.shape.Circle
import scalafx.scene.input.MouseEvent
import scalafx.scene.Scene

object Abacus2AddAllBallsAndOnClick extends JFXApp {

  val ROW_COUNT = 10
  val COL_COUNT = 10
  val RADIUS = 20
  val DIAMETER = 2 * RADIUS
  val WIDTH = COL_COUNT * DIAMETER
  val HEIGHT = ROW_COUNT * DIAMETER
  val MOVE_WAY = 100

  var circles: Seq[Circle] = null

  stage = new PrimaryStage {
    title = "scalaFX Abacus"
      width = WIDTH + MOVE_WAY
      height = HEIGHT

    circles = for (
      row <- 0 to ROW_COUNT;
      column <- 0 to COL_COUNT
    ) yield new Circle {
      radius = RADIUS - 1
      centerX = RADIUS + (column * DIAMETER)
      centerY = RADIUS + (row * DIAMETER)

      onMouseClicked = { translateX = MOVE_WAY }
    }

    scene = new Scene {
      content = circles
    }
  }

  private def makeCircle(row: Int, column: Int): Circle = {
    new Circle {
      radius = RADIUS - 1
      centerX = RADIUS + (column * DIAMETER)
      centerY = RADIUS + (row * DIAMETER)
    }
  }

}