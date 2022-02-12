package com.furkanakdemir.surroundcardview.path

import com.furkanakdemir.surroundcardview.PathOrientation

internal object PathDrawerFactory {

    fun create(pathOrientation: PathOrientation): PathDrawer {
        return when (pathOrientation) {
            PathOrientation.HORIZONTAL -> HorizontalPathDrawer()
            PathOrientation.HORIZONTAL_MIDDLE -> HorizontalMiddlePathDrawer()
            PathOrientation.VERTICAL -> VerticalPathDrawer()
            PathOrientation.VERTICAL_MIDDLE -> VerticalMiddlePathDrawer()
        }
    }

    fun default(): PathDrawer = HorizontalPathDrawer()
}
