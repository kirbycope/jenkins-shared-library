#! /user/bin/groovy

import com.timothycope.Sample

def Echo (config[:]) {
    Log.info(this, "Config: ${config}")
    assert config.Text
    def text = config.Text
    Sample.Foo(this, text)
}
