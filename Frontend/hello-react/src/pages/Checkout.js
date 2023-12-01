import { useEffect, useState } from "react";
import axios from "axios";

const Checkout = () => {

    const [products, setProducts] = useState(null);

    const getProducts = async () => {
        const response = await axios.get('http://localhost:8081/products');
        setProducts(response.data);
    }

    useEffect(() => {
        getProducts();
    },[]);
    return(
        <>
            <div className="container-fluid">
                <h1>Checking Out</h1>
                <div className="row">
                    <div className="col-md-6">
                        <h2>Products</h2>

                        {products && products.map(product => (
                            <div className="product-box px-2 py-2">
                                {product.name} - {product.price}
                                <button className="btn btn-sm btn-primary">Add to Order</button>
                            </div>
                        ))}
                    </div>
                    <div className="col-md-6">
                        <h2>Order</h2>

                        <table className="table atble-stripped">
                            <tr>
                                <thead>
                                <th>Product ID</th>
                                <th>Product Name</th>
                                <th>Price</th>
                                </thead>
                                <tbody>
                                    <tr>
                                    <td>06</td>
                                    <td>Sample Name</td>
                                    <td>500</td>
                                    </tr>
                                    <tr>
                                    <td>06</td>
                                    <td>Sample Name</td>
                                    <td>500</td>
                                    </tr>
                                    <tr>
                                    <td>06</td>
                                    <td>Sample Name</td>
                                    <td>500</td>
                                    </tr>
                                </tbody>
                                <thead>
                                    <tr>
                                    <th colSpan={2}>
                                        Total
                                    </th>
                                    <th>
                                        1500
                                    </th>
                                    </tr>
                                    <tr>
                                    <th colSpan={2}>
                                        Tax
                                    </th>
                                    <th>
                                        100
                                    </th>
                                    </tr>
                                </thead>
                            </tr>
                        </table>

                        <button className="btn btn-secondary">Complete Order</button>
                    </div>
                </div>
            </div>
        </>
    )
}

export default Checkout;