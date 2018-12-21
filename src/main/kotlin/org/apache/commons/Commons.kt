package org.apache.commons

import Apache

object Commons {
    const val GROUP = "${Apache.GROUP}.commons"
    const val VERSION = "1.5"
    // libraries below
    const val CSV = "commons-csv"
}

const val `commons-csv`: String = "${Commons.GROUP}:${Commons.CSV}:${Commons.VERSION}"
