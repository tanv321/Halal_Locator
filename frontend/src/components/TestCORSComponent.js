import React, { useEffect } from 'react';

const TestCORSComponent = () => {

    useEffect(() => {
        fetch("http://localhost:8080/api/test")
            .then(response => response.text())
            .then(data => console.log(data))
            .catch(error => console.error("Error fetching data:", error));
    }, []);

    return <div>Testing CORS...</div>;
}

export default TestCORSComponent;
