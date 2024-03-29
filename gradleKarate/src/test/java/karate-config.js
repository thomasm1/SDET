function fn() {
	 var env = karate.env; // java system property 'karate.env'
 
    if (karate.env === 'docker') {
        var driverConfig = {
            type: 'chrome',
            showDriverLog: true,
            start: false,
            beforeStart: 'supervisorctl start ffmpeg',
            afterStop: 'supervisorctl stop ffmpeg',
            videoFile: '/tmp/karate.mp4' 
        };
        karate.configure('driver', driverConfig);
    } else if (karate.env === 'jobserver') {
        karate.configure('driver', {type: 'chrome', showDriverLog: true, start: false});
 
    } else {
        karate.configure('driver', {type: 'chrome', showDriverLog: true});
 
    }
    return {}
}