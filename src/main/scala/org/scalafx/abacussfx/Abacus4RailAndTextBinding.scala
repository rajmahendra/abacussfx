package org.scalafx.abacussfx
/*
 * Copyright (c) 2013, ScalaFX Project
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of the ScalaFX Project nor the
 *       names of its contributors may be used to endorse or promote products
 *       derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE SCALAFX PROJECT OR ITS CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED
 * AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.shape.{ Circle, Rectangle }
import scalafx.scene.input.MouseEvent
import scalafx.animation.TranslateTransition
import scalafx.scene.paint.Color
import scalafx.scene.text.Text
import scalafx.scene.layout.Pane
/**
  * This program shows how to draw rails using Rectangle shape and using text.
  *
  *  @author Rajmahendra Hegde <rajmahendra@gmail.com>
  */
object Abacus4RailAndTextBinding extends JFXApp  with AbacusCommon {

    var circles: Seq[Circle] = null
    var rails: Seq[Rectangle] = null

    rails = for (row <- 0 to ROW_COUNT) yield new Rectangle {
        width = WIDTH
        height = RAIL_HEIGHT
        x = PADDING
        y = OFFSET - (RAIL_HEIGHT / 2) + (row * DIAMETER)
    }

    stage = new PrimaryStage {
        title = "scalaFX Abacus"
        width = WIDTH + 2 * PADDING
        height = HEIGHT + 2 * PADDING

        scene = new Scene {
            content = rails
        }
    }

}