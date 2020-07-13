package controllers

import javax.inject._
import play.api.mvc.{AbstractController, Action, AnyContent, ControllerComponents}

/**
  * AssetsController
  *
  * @author Archx[archx@foxmail.com]
  *         at 2018/9/27 14:07
  */
class HomeController @Inject()(components: ControllerComponents, assets: Assets)
  extends AbstractController(components) {

  //  def assets(file: String): Action[AnyContent] = {
  //    assets.at(file)
  //  }

  def index = Action {
    //sOk(views.html.index("Todo List")
  }
}