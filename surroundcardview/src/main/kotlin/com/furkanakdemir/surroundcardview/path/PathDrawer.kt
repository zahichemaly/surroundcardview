package com.furkanakdemir.surroundcardview.path

import android.graphics.Path

internal interface PathDrawer {
    fun prepare(path: Path, radiusCorner: Float, linePadding: Float, width: Float, height: Float)
}
