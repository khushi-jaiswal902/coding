export default async function Blog1({params}) {
    const paramsObj = await params;
    const {blogID} = paramsObj;
    console.log(paramsObj);
    return <div>All Comments on <b>{blogID}</b> page</div>
}