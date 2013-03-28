import glassfishjdbcgrailspostgresql.Sample

class BootStrap {

    def init = { servletContext ->

        for (int i in 1..10) {
            Sample sample = new Sample(info: "Some Text")
            sample.save()
        }
        log.info("Loaded Samples")
    }
    def destroy = {
    }
}
