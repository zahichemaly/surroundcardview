package com.furkanakdemir.surroundcardview.path

import android.graphics.Path

internal class VerticalPathDrawer : PathDrawer {

    override fun prepare(path: Path, radiusCorner: Float, linePadding: Float, width: Float, height: Float) {
        path.reset()
        path.moveTo(radiusCorner, linePadding)
        path.quadTo(linePadding, linePadding, linePadding, radiusCorner)
        path.lineTo(linePadding, height - radiusCorner)
        path.quadTo(
            linePadding,
            height - linePadding,
            radiusCorner,
            height - linePadding
        )
        path.lineTo(width - radiusCorner, height - linePadding)
        path.quadTo(
            width - linePadding,
            height - linePadding,
            width - linePadding,
            height - radiusCorner
        )
        path.lineTo(width - linePadding, radiusCorner)
        path.quadTo(
            width - linePadding,
            linePadding,
            width - radiusCorner,
            linePadding
        )
        path.lineTo(radiusCorner, linePadding)
    }
}
