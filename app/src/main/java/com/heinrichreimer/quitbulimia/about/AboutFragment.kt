package com.heinrichreimer.quitbulimia.about

import android.content.Context
import com.danielstone.materialaboutlibrary.MaterialAboutFragment
import com.danielstone.materialaboutlibrary.model.MaterialAboutList
import com.heinrichreimer.quitbulimia.about.AboutContent.createMaterialAboutList

class AboutFragment : MaterialAboutFragment() {
    override fun getMaterialAboutList(c: Context): MaterialAboutList {
        return createMaterialAboutList(c)
    }
}