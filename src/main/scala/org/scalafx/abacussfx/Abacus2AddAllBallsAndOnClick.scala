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
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.shape.Circle
import scalafx.scene.input.MouseEvent
import scalafx.scene.Scene
/**
  * This program show the use of shapes and event handling like mouse click
  *
  *  @author Rajmahendra Hegde <rajmahendra@gmail.com>
  */
object Abacus2AddAllBallsAndOnClick extends JFXApp with AbacusCommons {

    var circles: Seq[Circle] = null

    circles = for (
        row <- 0 to ROW_COUNT - 1;
        col <- 0 to COL_COUNT - 1
    ) yield makeBalls(row, col)

    private def makeBalls(row: Int, col: Int): Circle = new Circle {
        radius = RADIUS - 1
        centerX = RADIUS + (col * DIAMETER)
        centerY = RADIUS + (row * DIAMETER)

        onMouseClicked = (e: MouseEvent) => { translateX = MOVE_WAY }
    }
    
    stage = new PrimaryStage {
        title = "Abacus 2 - Add All Balls And OnClick"
        width = WIDTH
        height = HEIGHT
        scene = new Scene {
            content = circles
        }
    }

}