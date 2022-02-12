package com.furkanakdemir.surroundcardview.path

import android.graphics.Path

internal class HorizontalMiddlePathDrawer : PathDrawer {

    override fun prepare(path: Path, radiusCorner: Float, linePadding: Float, width: Float, height: Float) {
        path.reset()
        path.moveTo((width / 2), linePadding)
        path.lineTo(width - radiusCorner, linePadding)
        path.quadTo(
            width - linePadding,
            linePadding,
            width - linePadding,
            radiusCorner
        )
        path.lineTo(
            width - linePadding,
            height - radiusCorner
        )
        path.quadTo(
            width - linePadding,
            height - linePadding,
            width - radiusCorner,
            height - linePadding
        )
        path.lineTo(radiusCorner, height - linePadding)
        path.quadTo(
            linePadding,
            height - linePadding,
            linePadding,
            height - radiusCorner
        )
        path.lineTo(linePadding, radiusCorner)
        path.quadTo(linePadding, linePadding, radiusCorner, linePadding)
        path.lineTo((width / 2), linePadding)
    }
}
