package org.scalafx.abacussfx

import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.shape.Circle
import scalafx.scene.Scene

object Abacus1HelloWorld extends JFXApp {

  val circle = new Circle {
    radius = 20
    centerX = 20
    centerY = 20

  }

  stage = new PrimaryStage {
    title = "Abacus HelloWorld"
    width = 400
    height = 400

    scene = new Scene {
      content = Seq(circle)
    }

  }

}