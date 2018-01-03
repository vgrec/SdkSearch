package com.jakewharton.sdksearch.references

import com.jakewharton.sdksearch.references.SourceProject.BASE
import com.jakewharton.sdksearch.references.SourceProject.CONSTRAINT_LAYOUT
import com.jakewharton.sdksearch.references.SourceProject.DATABINDING
import com.jakewharton.sdksearch.references.SourceProject.ICU
import com.jakewharton.sdksearch.references.SourceProject.LIBCORE
import com.jakewharton.sdksearch.references.SourceProject.MULTIDEX
import com.jakewharton.sdksearch.references.SourceProject.SUPPORT
import com.jakewharton.sdksearch.references.SourceProject.TELEPHONY
import com.jakewharton.sdksearch.references.SourceProject.VOIP

const val PRODUCTION_DAC = "https://developer.android.com/"
const val PRODUCTION_GITWEB = "https://android.googlesource.com/"

val REFERENCE_LISTS = mapOf(
    "platform" to "reference/lists.js",
    "support" to "reference/android/support/lists.js",
    "wear" to "reference/android/support/wearable/lists.js",
    "test" to "reference/android/support/test/lists.js",
    "constraint" to "reference/android/support/constraint/lists.js",
    "arch" to "reference/android/arch/lists.js"
)

enum class SourceProject(val projectDir: String) {
  LIBCORE("platform/libcore/"),
  BASE("platform/frameworks/base/"),
  VOIP("platform/frameworks/opt/net/voip/"),
  TELEPHONY("platform/frameworks/opt/telephony/"),
  SUPPORT("platform/frameworks/support/"),
  MULTIDEX("platform/frameworks/multidex/"),
  CONSTRAINT_LAYOUT("platform/frameworks/opt/sherpa/"),
  ICU("platform/external/icu/"),
  DATABINDING("platform/frameworks/data-binding/"),
  ;

  init {
    check(projectDir.endsWith('/'))
  }

  fun path(dir: String) = SourceLocation(this, dir)
}
data class SourceLocation(val project: SourceProject, val baseDir: String) {
  init {
    check(baseDir.endsWith('/'))
  }
}

val PACKAGE_SOURCE_MAP = mapOf(
    "android" to BASE.path("core/java/"),

    "android.arch.lifecycle" to SUPPORT.path("lifecycle/extensions/src/main/java/"),
    "android.arch.paging" to SUPPORT.path("paging/common/src/main/java/"),
    "android.arch.persistence.db" to SUPPORT.path("room/db/src/main/java/"),
    "android.arch.persistence.db.framework" to SUPPORT.path("room/db-impl/src/main/java/"),
    "android.arch.persistence.room" to SUPPORT.path("room/common/src/main/java/"),
    "android.arch.persistence.room.migration" to SUPPORT.path("room/runtime/src/main/java/"),
    "android.arch.persistence.room.testing" to SUPPORT.path("room/testing/src/main/java/"),

    "android.databinding" to DATABINDING.path("extensions/library/src/main/java/"),
    "android.databinding.Bindable" to DATABINDING.path("baseLibrary/src/main/java/"),
    "android.databinding.BindingAdapter" to DATABINDING.path("baseLibrary/src/main/java/"),
    "android.databinding.BindingConversion" to DATABINDING.path("baseLibrary/src/main/java/"),
    "android.databinding.BindingMethod" to DATABINDING.path("baseLibrary/src/main/java/"),
    "android.databinding.BindingMethods" to DATABINDING.path("baseLibrary/src/main/java/"),
    "android.databinding.CallbackRegistry" to DATABINDING.path("baseLibrary/src/main/java/"),
    "android.databinding.InverseBindingAdapter" to DATABINDING.path("baseLibrary/src/main/java/"),
    "android.databinding.InverseBindingListener" to DATABINDING.path("baseLibrary/src/main/java/"),
    "android.databinding.InverseBindingMethod" to DATABINDING.path("baseLibrary/src/main/java/"),
    "android.databinding.InverseBindingMethods" to DATABINDING.path("baseLibrary/src/main/java/"),
    "android.databinding.Observable" to DATABINDING.path("baseLibrary/src/main/java/"),
    "android.databinding.ObservableList" to DATABINDING.path("baseLibrary/src/main/java/"),
    "android.databinding.ObservableMap" to DATABINDING.path("baseLibrary/src/main/java/"),

    "android.drm" to BASE.path("drm/java/"),
    "android.drm.mobile1" to BASE.path("media/java/"),
    "android.renderscript" to BASE.path("rs/java/"),
    "android.graphics" to BASE.path("graphics/java/"),
    "android.icu" to ICU.path("android_icu4j/src/main/java/"),
    "android.security" to BASE.path("keystore/java/"),
    "android.security.NetworkSecurityPolicy" to BASE.path("core/java/"),
    "android.system" to LIBCORE.path("luni/src/main/java/"),
    "android.location" to BASE.path("location/java/"),
    "android.media" to BASE.path("media/java/"),
    "android.media.effect" to BASE.path("media/mca/effect/java/"),
    "android.mtp" to BASE.path("media/java/"),
    "android.net.rtp" to VOIP.path("src/java/"),
    "android.net.sip" to VOIP.path("src/java/"),
    "android.net.wifi" to BASE.path("wifi/java/"),
    "android.opengl" to BASE.path("opengl/java/"),
    "android.sax" to BASE.path("sax/java/"),
    "android.telecom" to BASE.path("telecomm/java/"),
    "android.telephony" to BASE.path("telephony/java/"),
    "android.telephony.gsm.SmsManager" to TELEPHONY.path("src/java/"),
    "android.telephony.gsm.SmsMessage" to TELEPHONY.path("src/java/"),

    "android.support.animation" to SUPPORT.path("dynamic-animation/src/main/java/"),
    "android.support.annotation" to SUPPORT.path("annotations/src/main/java/"),
    "android.support.app.recommendation" to SUPPORT.path("recommendation/src/main/java/"),
    "android.support.compat" to null,
    "android.support.content" to SUPPORT.path("content/src/main/java/"),
    "android.support.coreui" to null,
    "android.support.coreutils" to null,
    "android.support.customtabs" to SUPPORT.path("customtabs/src/main/java/"),
    "android.support.design" to SUPPORT.path("design/src/"),
    "android.support.fragment" to null,
    "android.support.graphics.drawable" to SUPPORT.path("graphics/drawable/static/src/main/java/"),
    "android.support.multidex" to MULTIDEX.path("library/src/"),
    "android.support.media" to SUPPORT.path("exifinterface/src/main/java/"),
    "android.support.media.tv" to SUPPORT.path("tv-provider/src/main/java/"),
    "android.support.mediacompat" to null,
    "android.support.mediacompat.testlib" to SUPPORT.path("media-compat-test-lib/src/main/java/"),
    "android.support.percent" to SUPPORT.path("percent/src/main/java/"),
    "android.support.text.emoji" to SUPPORT.path("emoji/core/src/main/java/"),
    "android.support.text.emoji.bundled" to SUPPORT.path("emoji/bundled/src/main/java/"),
    "android.support.text.emoji.widget" to SUPPORT.path("emoji/appcompat/src/main/java/"),
    "android.support.transition" to SUPPORT.path("transition/src/"),
    "android.support.v4" to SUPPORT.path("compat/src/main/java/"),
    "android.support.v4.content" to SUPPORT.path("core-utils/src/main/java/"),
    "android.support.v4.math" to SUPPORT.path("core-utils/src/main/java/"),
    "android.support.v4.media" to SUPPORT.path("media-compat/java/"),
    "android.support.v4.print" to SUPPORT.path("core-utils/src/main/java/"),
    "android.support.v4.provider" to SUPPORT.path("core-utils/src/main/java/"),
    "android.support.v4.view.animation" to SUPPORT.path("core-ui/src/main/java/"),
    "android.support.v4.widget" to SUPPORT.path("core-ui/src/main/java/"),
    "android.support.v7" to SUPPORT.path("compat/src/main/java/"),
    "android.support.v7.app" to SUPPORT.path("v7/appcompat/src/main/java/"),
    "android.support.v7.content.res" to SUPPORT.path("v7/appcompat/src/main/java/"),
    "android.support.v7.graphics" to SUPPORT.path("v7/palette/src/main/java/"),
    "android.support.v7.graphics.drawable" to SUPPORT.path("v7/appcompat/src/main/java/"),
    "android.support.v7.media" to SUPPORT.path("v7/mediarouter/src/"),
    "android.support.v7.preference" to SUPPORT.path("v7/preference/src/main/java/"),
    "android.support.v7.recyclerview.extensions" to SUPPORT.path("paging/runtime/src/main/java/"),
    "android.support.v7.util" to SUPPORT.path("v7/recyclerview/src/main/java/"),
    "android.support.v7.view" to SUPPORT.path("v7/appcompat/src/main/java/"),
    "android.support.v7.widget" to SUPPORT.path("v7/appcompat/src/main/java/"),
    "android.support.v7.widget.helper" to SUPPORT.path("v7/recyclerview/src/main/java/"),
    "android.support.v7.widget.util" to SUPPORT.path("v7/recyclerview/src/main/java/"),
    "android.support.v8.renderscript" to SUPPORT.path("v8/renderscript/java/src/"),
    "android.support.v13" to SUPPORT.path("v13/java/"),
    "android.support.v14.preference" to SUPPORT.path("v14/preference/src/main/java/"),
    "android.support.v17.leanback" to SUPPORT.path("v17/leanback/src/"),
    "android.support.v17.preference" to SUPPORT.path("v17/preference-leanback/src/"),
    "android.support.wear" to SUPPORT.path("wear/src/main/java/"),
    "android.support.constraint" to CONSTRAINT_LAYOUT.path("constraintlayout/src/main/java/"),

    "android.test" to BASE.path("test-runner/src/"),
    "android.test.mock" to BASE.path("test-mock/src/"),

    "android.view.PixelCopy" to BASE.path("graphics/java/"),

    "java" to LIBCORE.path("ojluni/src/main/java/"),
    "java.math" to LIBCORE.path("luni/src/main/java/"),

    "javax" to LIBCORE.path("ojluni/src/main/java/"),
    "javax.microedition" to BASE.path("opengl/java/"),
    "javax.xml" to LIBCORE.path("luni/src/main/java/"),

    "org" to LIBCORE.path("luni/src/main/java/"),
    "org.json" to LIBCORE.path("json/src/main/java/"),
    "org.xmlpull" to null,
    "org.apache.http" to LIBCORE.path("core/java/")
)

fun sourceUrl(packageName: String, className: String): String? {
  val topLevelClassName = className.substringBefore('.')

  var lookup = "$packageName.$topLevelClassName"
  while (true) {
    if (PACKAGE_SOURCE_MAP.containsKey(lookup)) {
      val path = PACKAGE_SOURCE_MAP[lookup] ?: return null // Explicitly absent.
      return buildString {
        append(PRODUCTION_GITWEB)
        append(path.project.projectDir)
        append("+/refs/heads/master/")
        append(path.baseDir)
        append(packageName.replace('.', '/'))
        append('/')
        append(topLevelClassName)
        append(".java")
      }
    }
    val lastDot = lookup.lastIndexOf('.')
    if (lastDot == -1) {
      return null // No entry.
    }
    lookup = lookup.substring(0, lastDot)
  }
}